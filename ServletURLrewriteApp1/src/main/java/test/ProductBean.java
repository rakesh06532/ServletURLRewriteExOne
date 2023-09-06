package test;

import java.io.*;

@SuppressWarnings("serial")
public class ProductBean implements Serializable {
	public ProductBean() {}
	private String PCode,PName;
	public String getPCode() {
		return PCode;
	}
	public void setPCode(String pCode) {
		PCode = pCode;
	}
	public String getPName() {
		return PName;
	}
	public void setPName(String pName) {
		PName = pName;
	}
	public float getPPrice() {
		return PPrice;
	}
	public void setPPrice(float pPrice) {
		PPrice = pPrice;
	}
	public int getPQnty() {
		return PQnty;
	}
	public void setPQnty(int pQnty) {
		PQnty = pQnty;
	}
	private float PPrice;
	private int PQnty;

}
