package com.Yarraneella.Hotel.service;

import java.util.List;

import com.Yarraneella.Hotel.binding.SearchCriteria;
import com.Yarraneella.Hotel.entity.StudentEnq;



public interface EnquiryService {
	
	public boolean addEnq(StudentEnq se);

	public List<StudentEnq> getEnquiries(Integer cid, SearchCriteria s);

}
