public class Message {
	Object origin;
	String topic;
	String payload;
	
	// message is from someone 
	// about something (topic)
	// actual message is in payload
	
	Message(Object origin, String topic, String payload){
		this.origin=origin;
		this.topic=topic;
		this.payload=payload;
	}
	
	public String toString() {
		return "origin:"+origin+"\ntopic:"+topic+"\npayload:"+payload;
	}
}
