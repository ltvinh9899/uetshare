package com.example.uetshare.retrofit.data.response;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class SendNotificationResponse{

	@SerializedName("canonical_ids") public Integer canonicalIds;
	@SerializedName("success") public Integer success;
	@SerializedName("failure") public Integer failure;
	@SerializedName("results") public List<ResultsItem> results;
	@SerializedName("multicast_id") public Long multicastId;
}