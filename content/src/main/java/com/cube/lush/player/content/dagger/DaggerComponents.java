package com.cube.lush.player.content.dagger;

import com.cube.lush.player.content.dagger.api.APIComponent;
import com.cube.lush.player.content.dagger.api.APIModule;
import com.cube.lush.player.content.dagger.api.DaggerAPIComponent;

import lombok.Getter;

/**
 * Created by Jamie Cruwys of 3 SIDED CUBE on 23/03/2017.
 */
public class DaggerComponents
{
	private static DaggerComponents instance;
	@Getter protected APIComponent api;

	public static DaggerComponents getInstance()
	{
		if (instance == null)
		{
			instance = new DaggerComponents();
		}

		return instance;
	}

	private DaggerComponents()
	{
		api = DaggerAPIComponent.builder()
			.aPIModule(new APIModule("http://admin.player.lush.com/lushtvapi/v1/views/"))
			.build();
	}
}