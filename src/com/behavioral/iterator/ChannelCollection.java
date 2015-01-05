package com.behavioral.iterator;

public interface ChannelCollection {

	public void removeChannel(Channel channel);
	public void addChannel(Channel channel);
	public int size();
	
	public ChannelIterator iterator(ChannelTypeEnum type);
}
