package com.grunick.addresstagger.input;

import java.util.List;
import java.util.Map;

import com.grunick.addresstagger.data.Address;
import com.grunick.addresstagger.data.AddressTag;
import com.grunick.addresstagger.tokenize.Tokenizer;

public interface InputSource {
		
	public Address getNext() throws InputException;
	
	public boolean hasNext();
	
	public void close();
	
	public void init() throws InputException;
	
	public List<String> getColumnNames();
	
	public Map<String, AddressTag> getColumnToTagMap();
	
	public void setTokenizer(Tokenizer tokenizer);
	
	public void reset() throws InputException;

}
