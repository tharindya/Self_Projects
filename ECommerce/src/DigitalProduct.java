/* 
 * File name: DigitalProduct.java
 * Author: Tharindya Anjalika
 * Date: 09/07/2024
 * Purpose: Understand and implement the concept of polymorphism
 */
public class DigitalProduct extends Product{
	
	/**
	 * file Size variable
	 */
	private double fileSize;
	/**
	 * download link variable
	 */
	private String downloadLink;

	/**
	 * Constructor for the DigitalProduct variables and extended costrcutor from the Product
	 * @param name
	 * @param price
	 * @param category
	 * @param fileSize
	 * @param downloadLink
	 */
	public DigitalProduct(String name, double price, String category, double fileSize, String downloadLink) {
		super(name, price, category);
		this.fileSize=fileSize;
		this.downloadLink=downloadLink;
	}

	/**
	 * getter for the file Size
	 * @return
	 */
	public double getfileSize() {
		return fileSize;
	}

	/**
	 * setter for the file Size
	 * @param fileSize
	 */
	public void setfileSize(double fileSize) {
		this.fileSize = fileSize;
	}
	
	/**
	 * getter for the download Link
	 * @return
	 */
	public String getdownloadLink() {
		return downloadLink;
	}

	/**
	 * setter for the download link
	 * @param downloadLink
	 */
	public void setdownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
	}
	
	@Override
	public String toString() {
		return "Physical Product Details:\n"+"Product Name:"+getname()+"\nPrice: $"+
	            getprice()+ "\ncategory:"+getcategory()+"\nFile Size:"+fileSize+"MB"+
				"\nDownload Link:"+downloadLink;
	}

	@Override
	public String purchaseProduct() {
		// TODO Auto-generated method stub
		return "Your Digital Product is Ready fo Download";
	}

}
