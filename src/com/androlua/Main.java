package com.androlua;

import android.content.*;

public class Main extends LuaActivity
{

	@Override
	public String getLuaDir()
	{
		// TODO: Implement this method
		return getLocalDir();
	}

	@Override
	public String getLuaPath()
	{
		// TODO: Implement this method
		return getLocalDir()+"/main.lua";
	}

}
