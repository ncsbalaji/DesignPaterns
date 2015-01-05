package com.behavioral.iterator;

public class IteratorPaternTest {

	private static ChannelCollection populateChannels() {
        ChannelCollection channels = new ChannelCollectionImpl();
        channels.addChannel(new Channel(98.5, ChannelTypeEnum.English));
        channels.addChannel(new Channel(99.5, ChannelTypeEnum.Hindi));
        channels.addChannel(new Channel(100.5, ChannelTypeEnum.Telugu));
        channels.addChannel(new Channel(101.5, ChannelTypeEnum.English));
        channels.addChannel(new Channel(102.5, ChannelTypeEnum.Hindi));
        channels.addChannel(new Channel(103.5, ChannelTypeEnum.Telugu));
        channels.addChannel(new Channel(104.5, ChannelTypeEnum.English));
        channels.addChannel(new Channel(105.5, ChannelTypeEnum.Hindi));
        channels.addChannel(new Channel(106.5, ChannelTypeEnum.Telugu));
        return channels;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChannelCollection channels = populateChannels();
		ChannelIterator baseIterator = channels.iterator(ChannelTypeEnum.ALL);
		ChannelIterator teluguIterator = channels.iterator(ChannelTypeEnum.Telugu);
		
		System.out.println(channels.size());
		
		while(baseIterator.hasNext()){
			Channel channel = baseIterator.next();
			System.out.println(channel);
		}
		
		System.out.println("\n*****-----------------*******\n");
		
		while(teluguIterator.hasNext()){
			Channel channel = teluguIterator.next();
			System.out.println(channel);
		}
		
	}

}
