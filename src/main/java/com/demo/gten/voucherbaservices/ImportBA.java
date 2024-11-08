package com.demo.gten.voucherbaservices;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.demo.param.Heads;
import com.demo.param.Methods;

import com.demo.commons.WebAPISecretary;

public class ImportBA extends WebAPISecretary {
	ImportBA() {
		super();
		super.setWsdlURL("http://127.0.0.1:8080/GTEN/financeService/services/VoucherBAService?wsdl");
	}
	public static void main(String[] args) {
		ImportBA obj = new ImportBA();
		try {
			obj.setBody(getXML("30ccf1f39b9c468089c6e74a723e3bdc",
					getFileByte("D:\\工作\\GTEN\\TP-112-10010000-43-00-002001-B2-00157.zip")));
			obj.spnedRequest(Methods.POST.getMethod(), Heads.XML.getMethod());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getXML(String tokenKey, String file) {
		String soapXML = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://Webservice.mali.com.tw\">\r\n"
				+ "   <soapenv:Header/>\r\n"
				+ "   <soapenv:Body>\r\n"
				+ "         <web:doImportZIPData>\r\n"
				+ "         <tokenKey>"
				+ tokenKey
				+ "</tokenKey>\r\n"
				+ "         <zipdata>"
				+ file
				+ "</zipdata>\r\n"
				+ "         <sys>D</sys>\r\n"
				+ "      </web:doImportZIPData>\r\n"
				+ "   </soapenv:Body>\r\n"
				+ "</soapenv:Envelope>";
		return soapXML;
	}

	public static String getFileByte(String filePath) throws IOException {
		File file = new File(filePath);
		InputStream fin = new FileInputStream(file);
		long length = file.length();
		byte[] bytes = new byte[(int) length];
		int offset = 0;
		int numRead = 0;
		while (offset<bytes.length &&(numRead=fin.read(bytes,offset,bytes.length-offset))>=0){
			offset+=numRead;
			}
		fin.close();
		if(offset < bytes.length){
			throw new IOException("不能完全讀取文件："+ file.getName());
		}
//		return  Base64.encode(bytes);
		return  new String(bytes);
	}
}
