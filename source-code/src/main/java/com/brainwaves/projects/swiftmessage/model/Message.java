package com.brainwaves.projects.swiftmessage.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Message {

	private String id;
	private String transactionA;
	private String transactionB;
	private String ourReference;
	private String operationType;
	private String code;
	private String operationScope;
	private String partyA;
	private String partyB;
	private String isdaDate;
	private String contractDate;
	private String valueDate;
	private String exchangeRate;
	private String weBuy;
	private String deliveryAgent1;
	private String intermediary1;
	private String settlement1;
	private String beneficiary1;
	private String deliveryAgent2;
	private String intermediary2;
	private String settlement2;
	private String beneficiary2;
	private String weSell;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTransactionA() {
		return transactionA;
	}

	public void setTransactionA(String transactionA) {
		this.transactionA = transactionA;
	}

	public String getTransactionB() {
		return transactionB;
	}

	public void setTransactionB(String transactionB) {
		this.transactionB = transactionB;
	}

	public String getOurReference() {
		return ourReference;
	}

	public void setOurReference(String ourReference) {
		this.ourReference = ourReference;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getOperationScope() {
		return operationScope;
	}

	public void setOperationScope(String operationScope) {
		this.operationScope = operationScope;
	}

	public String getPartyA() {
		return partyA;
	}

	public void setPartyA(String partyA) {
		this.partyA = partyA;
	}

	public String getPartyB() {
		return partyB;
	}

	public void setPartyB(String partyB) {
		this.partyB = partyB;
	}

	public String getIsdaDate() {
		return isdaDate;
	}

	public void setIsdaDate(String isdaDate) {
		this.isdaDate = isdaDate;
	}

	public String getContractDate() {
		return contractDate;
	}

	public void setContractDate(String contractDate) {
		this.contractDate = contractDate;
	}

	public String getValueDate() {
		return valueDate;
	}

	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}

	public String getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public String getWeBuy() {
		return weBuy;
	}

	public void setWeBuy(String weBuy) {
		this.weBuy = weBuy;
	}


	public String getWeSell() {
		return weSell;
	}

	public void setWeSell(String weSell) {
		this.weSell = weSell;
	}

	public String getDeliveryAgent1() {
		return deliveryAgent1;
	}

	public void setDeliveryAgent1(String deliveryAgent1) {
		this.deliveryAgent1 = deliveryAgent1;
	}

	public String getIntermediary1() {
		return intermediary1;
	}

	public void setIntermediary1(String intermediary1) {
		this.intermediary1 = intermediary1;
	}

	public String getSettlement1() {
		return settlement1;
	}

	public void setSettlement1(String settlement1) {
		this.settlement1 = settlement1;
	}

	public String getBeneficiary1() {
		return beneficiary1;
	}

	public void setBeneficiary1(String beneficiary1) {
		this.beneficiary1 = beneficiary1;
	}

	public String getDeliveryAgent2() {
		return deliveryAgent2;
	}

	public void setDeliveryAgent2(String deliveryAgent2) {
		this.deliveryAgent2 = deliveryAgent2;
	}

	public String getIntermediary2() {
		return intermediary2;
	}

	public void setIntermediary2(String intermediary2) {
		this.intermediary2 = intermediary2;
	}

	public String getSettlement2() {
		return settlement2;
	}

	public void setSettlement2(String settlement2) {
		this.settlement2 = settlement2;
	}

	public String getBeneficiary2() {
		return beneficiary2;
	}

	public void setBeneficiary2(String beneficiary2) {
		this.beneficiary2 = beneficiary2;
	}

}
