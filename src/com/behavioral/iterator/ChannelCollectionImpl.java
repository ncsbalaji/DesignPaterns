package com.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {
	
	List<Channel> channels;
	
	public ChannelCollectionImpl() {
		channels = new ArrayList<Channel>();
	}

	@Override
	public void removeChannel(Channel channel) {
		// TODO Auto-generated method stub
		this.channels.remove(channel);

	}

	@Override
	public void addChannel(Channel channel) {
		// TODO Auto-generated method stub
		this.channels.add(channel);
	}

	@Override
	public ChannelIterator iterator(ChannelTypeEnum type) {
		return new ChannelIteratorImpl(type, channels);
	}

	@Override
	public int size() {
		return channels.size();
	}

}
