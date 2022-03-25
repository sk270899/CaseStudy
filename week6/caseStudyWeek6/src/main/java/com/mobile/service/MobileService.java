package com.mobile.service;

import java.util.Optional;

import com.mobile.entity.Mobile;

public interface MobileService {
	//add mobile service method
	Mobile addMobile(Mobile mobile);

	//update mobile service method
	Mobile updateMobile(Mobile mobile);

	//delete mobile service method
	void deleteMobile(int mobileId);

	//get mobile service method
	Optional<Mobile> getMobile(int mobileId);

	//getAllMobiles service method
	Iterable<Mobile> getAllMobiles();
}
