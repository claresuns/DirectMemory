package org.directmemory.store;

import org.directmemory.cache.CacheEntry;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class OffHeapStore extends AbstractQueuedStore {

	@Override
	String storeName() {
		return "OffHeapStore";
	}
	private static final long serialVersionUID = 1L;

	@Override
	void asyncPopIn(CacheEntry queuedEntry) {
		// read the object
		if (queuedEntry.inHeap()) {
			// serialize the object
			// queuedEntry.buffer = getBufferFor(...);
		} else if (queuedEntry.offHeap()) {
			// do nothing
		} else {
			// nonsense
		}
		queuedEntry.setStore(this); // done, take it
	}

	@Override
	void popOut(CacheEntry entry) {
		throw new NotImplementedException();
	}

	@Override
	byte[] toStream(CacheEntry entry) {
		throw new NotImplementedException();
	}

	@Override
	Object toObject(CacheEntry entry) {
		throw new NotImplementedException();
	}

}