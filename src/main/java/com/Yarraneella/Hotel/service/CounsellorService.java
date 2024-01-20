package com.Yarraneella.Hotel.service;

import com.Yarraneella.Hotel.binding.DashboardResponse;
import com.Yarraneella.Hotel.entity.Counsellor;

public interface CounsellorService {
	
	public String saveCounsellor(Counsellor c);
	 
	public Counsellor loginCheck(String email, String pwd);

	public boolean recoverPwd(String email);

	public DashboardResponse getDashboardInfo(Integer cid);

}
