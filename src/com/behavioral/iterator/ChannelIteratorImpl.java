package com.behavioral.iterator;

import java.util.List;

public class ChannelIteratorImpl implements ChannelIterator {
	
	private ChannelTypeEnum type;
	private List<Channel> channels;
	private int position=0;

	public ChannelIteratorImpl(ChannelTypeEnum type, List<Channel> channels) {
		this.type = type;
		this.channels = channels;
	}

	@Override
	public boolean hasNext() {
		
		while(position < channels.size()){
			Channel channel = channels.get(position);
			if(channel.getType().equals(type) || type.equals(ChannelTypeEnum.ALL)){
				return true;
			}else{
				position ++ ;
			}
		}
		return false;
		
	}

	@Override
	public Channel next() {
		Channel channel = channels.get(position);
		position ++ ;
		return channel;
	}

}
