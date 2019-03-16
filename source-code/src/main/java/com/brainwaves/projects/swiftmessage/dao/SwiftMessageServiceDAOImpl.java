package com.brainwaves.projects.swiftmessage.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.brainwaves.projects.swiftmessage.model.Message;

@Repository
public class SwiftMessageServiceDAOImpl implements SwiftMessageServiceDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Message> getMessages() {

		List<Message> messagesList = new ArrayList<>();
		try {
			StringBuilder sqlQuery = new StringBuilder("SELECT DISTINCT CLIENT.ID, CLIENT.TRANSACTION_A, CLIENT.TRANSACTION_B, CLIENT.OUR_REFERENCE, CLIENT.OPERATION_TYPE,\r\n" + 
					"CLIENT.CODE, CLIENT.OPERATION_SCOPE, CLIENT.PARTY_A, CLIENT.PARTY_B, CLIENT.ISDA_DATE,\r\n" + 
					"CLIENT.CONTRACT_DATE, CLIENT.VALUE_DATE, CLIENT.EXCHANGE_RATE, CLIENT.WE_BUY, CLIENT.DELIVERY_AGENT_1,\r\n" + 
					"CLIENT.DELIVERY_AGENT_2,\r\n" + 
					"CLIENT.INTERMEDIARY_1, CLIENT.INTERMEDIARY_2, CLIENT.SETTLEMENT_1, CLIENT.SETTLEMENT_2, CLIENT.BENEFICIARY_1,\r\n" + 
					"CLIENT.BENEFICIARY_2,\r\n" + 
					"CLIENT.WE_SELL FROM FX_SWIFT_CLIENT_DATA CLIENT INNER JOIN\r\n" + 
					" FX_SWIFT_SG_DATA SG_DATA ON CLIENT.TRANSACTION_A=SG_DATA.TRANSACTION_A\r\n" + 
					" AND CLIENT.TRANSACTION_B=SG_DATA.TRANSACTION_B AND\r\n" + 
					" CLIENT.PARTY_A=SG_DATA.PARTY_B AND CLIENT.PARTY_B=SG_DATA.PARTY_A AND\r\n" + 
					" CLIENT.ISDA_DATE=SG_DATA.ISDA_DATE AND CLIENT.CONTRACT_DATE=SG_DATA.CONTRACT_DATE\r\n" + 
					" AND CLIENT.VALUE_DATE=SG_DATA.VALUE_DATE AND CLIENT.EXCHANGE_RATE=SG_DATA.EXCHANGE_RATE\r\n" + 
					" AND CLIENT.WE_BUY=SG_DATA.WE_SELL AND CLIENT.WE_SELL=SG_DATA.WE_BUY");

			Collection<Map<String, Object>> rows = jdbcTemplate.queryForList(sqlQuery.toString());

			rows.stream().map((row) -> {
				Message message = new Message();
				message.setBeneficiary1((String) row.get("BENEFICIARY_1"));
				message.setCode((String) row.get("CODE"));
				message.setContractDate((String) row.get("CONTRACT_DATE"));
				message.setDeliveryAgent1((String) row.get("DELIVERY_AGENT_1"));
				message.setExchangeRate((String ) row.get("EXCHANGE_RATE"));
				message.setId(String.valueOf(row.get("ID")));
				message.setIntermediary1((String) row.get("INTERMEDIARY_1"));
				message.setIsdaDate((String) row.get("ISDA_DATE"));
				message.setOperationScope((String) row.get("OPERATION_SCOPE"));
				message.setOperationType((String) row.get("OPERATION_TYPE"));
				message.setOurReference((String) row.get("OUR_REFERENCE"));
				message.setPartyA((String) row.get("PARTY_A"));
				message.setPartyB((String) row.get("PARTY_B"));
				message.setSettlement1((String) row.get("SETTLEMENT_1"));
				message.setTransactionA((String) row.get("TRANSACTION_A"));
				message.setTransactionB((String) row.get("TRANSACTION_B"));
				message.setValueDate((String) row.get("VALUE_DATE"));
				message.setWeBuy((String) row.get("WE_BUY"));
				message.setWeSell((String) row.get("WE_SELL"));
				return message;
			}).forEach((ss) -> {
				messagesList.add(ss);
			});
		} catch (Exception e) {
			e.printStackTrace();

		}
		return messagesList;
	}

}
