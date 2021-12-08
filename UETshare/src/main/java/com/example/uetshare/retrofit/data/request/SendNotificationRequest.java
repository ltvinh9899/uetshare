package com.example.uetshare.retrofit.data.request;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class SendNotificationRequest{
	@SerializedName("collapse_key") public String collapseKey;
	@SerializedName("notification") public Notification notification;
	@SerializedName("data") public Data data;
	@SerializedName("registration_ids") public ArrayList<String> registrationIds;
	@SerializedName("priority") public String priority;
}