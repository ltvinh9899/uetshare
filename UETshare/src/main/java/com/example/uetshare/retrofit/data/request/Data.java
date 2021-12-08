package com.example.uetshare.retrofit.data.request;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Data{
	@SerializedName("title") public String title;
	@SerializedName("message") public String message;
}