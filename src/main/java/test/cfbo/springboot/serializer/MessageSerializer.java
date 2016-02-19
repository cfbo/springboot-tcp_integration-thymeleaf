package test.cfbo.springboot.serializer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.serializer.Deserializer;
import org.springframework.core.serializer.Serializer;
import org.springframework.util.StreamUtils;

public class MessageSerializer implements Serializer<byte[]>, Deserializer<byte[]>  {

	@SuppressWarnings("unused")
	private Logger logger = LoggerFactory.getLogger(MessageSerializer.class);
	
	@Override
	public byte[] deserialize(InputStream inputStream) throws IOException {
		
		return StreamUtils.copyToByteArray(inputStream);
		
	}

	@Override
	public void serialize(byte[] object, OutputStream outputStream) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
