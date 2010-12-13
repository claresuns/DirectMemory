package org.directcache;

import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

public interface IDirectCache {

	public abstract void reset();

	public abstract int getDefaultDuration();

	public abstract void setDefaultDuration(int defaultDuration);

	public abstract Map<String, ICacheEntry> entries();

	public abstract ICacheEntry storeObject(String key, Serializable obj)
			throws Exception;

	public abstract ICacheEntry storeObject(String key, Serializable obj,
			int duration) throws Exception;

	public abstract Serializable retrieveObject(String key) throws IOException,
			ClassNotFoundException;

	public abstract ICacheEntry removeObject(String key);

	public abstract int remaining();

	public abstract int usedMemory();

	public abstract int capacity();

}