package org.company;
public class CompanyInfo {
private void companyName() {
	System.out.println("WIPRO");
}
private void companyId() {
	System.out.println("12345");
}
private void companyAddress() {
	System.out.println("CHENNAI");
}
public static void main (String args[]) {
	CompanyInfo companyDetail = new CompanyInfo();
	companyDetail.companyName();
	companyDetail.companyId();
	companyDetail.companyAddress();
}
}
