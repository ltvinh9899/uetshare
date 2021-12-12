package com.example.uetshare.retrofit.data.request;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Notification{
	@SerializedName("title") public String title;
	@SerializedName("body") public String body;
}