package com.datastax.driver.core;

import org.testng.annotations.Test;

public class BoundStatement_GeneratedTest
{
  //later this has to go into a separate test support package
  public class TestSetupException extends Exception
  {
    public TestSetupException(Exception e)
      {
	super(e);
      }
  }

  @Test(groups = "unit")
  public void BoundStatement0_Test0() throws TestSetupException
  {	
    //set up
    PreparedStatement preparedStatement0;
    try
    {
      preparedStatement0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement0 = new BoundStatement(preparedStatement0);
  }

  @Test(groups = "unit")
  public void BoundStatement0_Test1() throws TestSetupException
  {	
    //set up
    PreparedStatement preparedStatement0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement0 = new BoundStatement(preparedStatement0);
  }

  @Test(groups = "unit")
  public void bind0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement1 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement1);
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.bind(); 
  }

  @Test(groups = "unit")
  public void bind0_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    Object object0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement1 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement1);
      object0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.bind(object0); 
  }

  @Test(groups = "unit")
  public void bind0_Test2() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    Object object0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement1 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement1);
      object0 = new Object();
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.bind(object0); 
  }

  @Test(groups = "unit")
  public void bind0_Test3() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    Object object0;
    try
    {
      byte[] byteArray0 = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement1 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement1);
      object0 = new Boolean(true);
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.bind(object0); 
  }

  @Test(groups = "unit")
  public void getBool0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    boolean boolean0 = boundStatement0.getBool(int0); 
  }

  @Test(groups = "unit")
  public void getBool1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    boolean boolean0 = boundStatement0.getBool(string0); 
  }

  @Test(groups = "unit")
  public void getBool1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    boolean boolean0 = boundStatement0.getBool(string0); 
  }

  @Test(groups = "unit")
  public void getBytes0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.nio.ByteBuffer byteBuffer0 = boundStatement0.getBytes(int0); 
  }

  @Test(groups = "unit")
  public void getBytes1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.nio.ByteBuffer byteBuffer0 = boundStatement0.getBytes(string0); 
  }

  @Test(groups = "unit")
  public void getBytes1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.nio.ByteBuffer byteBuffer0 = boundStatement0.getBytes(string0); 
  }

  @Test(groups = "unit")
  public void getBytesUnsafe0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.nio.ByteBuffer byteBuffer0 = boundStatement0.getBytesUnsafe(int0); 
  }

  @Test(groups = "unit")
  public void getBytesUnsafe1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.nio.ByteBuffer byteBuffer0 = boundStatement0.getBytesUnsafe(string0); 
  }

  @Test(groups = "unit")
  public void getBytesUnsafe1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.nio.ByteBuffer byteBuffer0 = boundStatement0.getBytesUnsafe(string0); 
  }

  @Test(groups = "unit")
  public void getDate0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.util.Date date0 = boundStatement0.getDate(int0); 
  }

  @Test(groups = "unit")
  public void getDate1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.util.Date date0 = boundStatement0.getDate(string0); 
  }

  @Test(groups = "unit")
  public void getDate1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.util.Date date0 = boundStatement0.getDate(string0); 
  }

  @Test(groups = "unit")
  public void getDecimal0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.math.BigDecimal bigDecimal0 = boundStatement0.getDecimal(int0); 
  }

  @Test(groups = "unit")
  public void getDecimal1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.math.BigDecimal bigDecimal0 = boundStatement0.getDecimal(string0); 
  }

  @Test(groups = "unit")
  public void getDecimal1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.math.BigDecimal bigDecimal0 = boundStatement0.getDecimal(string0); 
  }

  @Test(groups = "unit")
  public void getDouble0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    double double0 = boundStatement0.getDouble(int0); 
  }

  @Test(groups = "unit")
  public void getDouble1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    double double0 = boundStatement0.getDouble(string0); 
  }

  @Test(groups = "unit")
  public void getDouble1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    double double0 = boundStatement0.getDouble(string0); 
  }

  @Test(groups = "unit")
  public void getFloat0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    float float0 = boundStatement0.getFloat(int0); 
  }

  @Test(groups = "unit")
  public void getFloat1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    float float0 = boundStatement0.getFloat(string0); 
  }

  @Test(groups = "unit")
  public void getFloat1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    float float0 = boundStatement0.getFloat(string0); 
  }

  @Test(groups = "unit")
  public void getInet0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.net.InetAddress inetAddress0 = boundStatement0.getInet(int0); 
  }

  @Test(groups = "unit")
  public void getInet1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.net.InetAddress inetAddress0 = boundStatement0.getInet(string0); 
  }

  @Test(groups = "unit")
  public void getInet1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.net.InetAddress inetAddress0 = boundStatement0.getInet(string0); 
  }

  @Test(groups = "unit")
  public void getInt0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    int int1 = boundStatement0.getInt(int0); 
  }

  @Test(groups = "unit")
  public void getInt1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    int int0 = boundStatement0.getInt(string0); 
  }

  @Test(groups = "unit")
  public void getInt1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    int int0 = boundStatement0.getInt(string0); 
  }

  @Test(groups = "unit")
  public void getKeyspace0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    String string0 = boundStatement0.getKeyspace(); 
  }

  @Test(groups = "unit")
  public void getList0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    Class<Boolean> class_T0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
      class_T0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.util.List<Boolean> list_T0 = boundStatement0.getList(int0, class_T0); 
  }

  @Test(groups = "unit")
  public void getList1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    Class<Boolean> class_T0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
      class_T0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.util.List<Boolean> WWW0 = boundStatement0.getList(string0, class_T0); 
  }

  @Test(groups = "unit")
  public void getList1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    Class<Boolean> class_T0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
      class_T0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.util.List<Boolean> WWW0 = boundStatement0.getList(string0, class_T0); 
  }

  @Test(groups = "unit")
  public void getList2_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    com.google.common.reflect.TypeToken<Boolean> typeToken_V0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
      typeToken_V0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.util.List<Boolean> list_T0 = boundStatement0.getList(int0, typeToken_V0); 
  }

  @Test(groups = "unit")
  public void getList3_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    com.google.common.reflect.TypeToken<Boolean> typeToken_V0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
      typeToken_V0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.util.List<Boolean> list_T0 = boundStatement0.getList(string0, typeToken_V0); 
  }

  @Test(groups = "unit")
  public void getList3_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    com.google.common.reflect.TypeToken<Boolean> typeToken_V0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
      typeToken_V0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.util.List<Boolean> list_T0 = boundStatement0.getList(string0, typeToken_V0); 
  }

  @Test(groups = "unit")
  public void getLong0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    long long0 = boundStatement0.getLong(int0); 
  }

  @Test(groups = "unit")
  public void getLong1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    long long0 = boundStatement0.getLong(string0); 
  }

  @Test(groups = "unit")
  public void getLong1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    long long0 = boundStatement0.getLong(string0); 
  }

  @Test(groups = "unit")
  public void getMap0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    Class<Boolean> class_V0;
    Class<Boolean> class_V1;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
      class_V0 = null;
      class_V1 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.util.Map<Boolean, Boolean> map_K_V0 = boundStatement0.getMap(int0, class_V0, class_V1); 
  }

  @Test(groups = "unit")
  public void getMap1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    Class<Boolean> class_V0;
    Class<Boolean> class_V1;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
      class_V0 = null;
      class_V1 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.util.Map<Boolean, Boolean> map_K_V0 = boundStatement0.getMap(string0, class_V0, class_V1); 
  }

  @Test(groups = "unit")
  public void getMap1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    Class<Boolean> class_V0;
    Class<Boolean> class_V1;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
      class_V0 = null;
      class_V1 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.util.Map<Boolean, Boolean> map_K_V0 = boundStatement0.getMap(string0, class_V0, class_V1); 
  }

  @Test(groups = "unit")
  public void getMap2_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    com.google.common.reflect.TypeToken<Boolean> typeToken_V0;
    com.google.common.reflect.TypeToken<Boolean> typeToken_V1;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
      typeToken_V0 = null;
      typeToken_V1 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.util.Map<Boolean, Boolean> map_K_V0 = boundStatement0.getMap(int0, typeToken_V0, typeToken_V1); 
  }

  @Test(groups = "unit")
  public void getMap3_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    com.google.common.reflect.TypeToken<Boolean> typeToken_V0;
    com.google.common.reflect.TypeToken<Boolean> typeToken_V1;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
      typeToken_V0 = null;
      typeToken_V1 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.util.Map<Boolean, Boolean> map_K_V0 = boundStatement0.getMap(string0, typeToken_V0, typeToken_V1); 
  }

  @Test(groups = "unit")
  public void getMap3_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    com.google.common.reflect.TypeToken<Boolean> typeToken_V0;
    com.google.common.reflect.TypeToken<Boolean> typeToken_V1;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
      typeToken_V0 = null;
      typeToken_V1 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.util.Map<Boolean, Boolean> map_K_V0 = boundStatement0.getMap(string0, typeToken_V0, typeToken_V1); 
  }

  @Test(groups = "unit")
  public void getObject0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    Object object0 = boundStatement0.getObject(int0); 
  }

  @Test(groups = "unit")
  public void getObject1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    Object object0 = boundStatement0.getObject(string0); 
  }

  @Test(groups = "unit")
  public void getObject1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    Object object0 = boundStatement0.getObject(string0); 
  }

  @Test(groups = "unit")
  public void getRoutingKey0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement1 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement1);
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.nio.ByteBuffer byteBuffer0 = boundStatement0.getRoutingKey(); 
  }

  @Test(groups = "unit")
  public void getRoutingKey0_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement1 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement1);
      java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
      BoundStatement boundStatement1 = boundStatement0.setRoutingKey(byteBuffer1); 
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.nio.ByteBuffer byteBuffer0 = boundStatement0.getRoutingKey(); 
  }

  @Test(groups = "unit")
  public void getSet0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    Class<Boolean> class_V0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
      class_V0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.util.Set<Boolean> WWW0 = boundStatement0.getSet(int0, class_V0); 
  }

  @Test(groups = "unit")
  public void getSet1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    Class<Boolean> class_V0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
      class_V0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.util.Set<Boolean> WWW0 = boundStatement0.getSet(string0, class_V0); 
  }

  @Test(groups = "unit")
  public void getSet1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    Class<Boolean> class_V0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
      class_V0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.util.Set<Boolean> WWW0 = boundStatement0.getSet(string0, class_V0); 
  }

  @Test(groups = "unit")
  public void getSet2_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    com.google.common.reflect.TypeToken<Boolean> typeToken_V0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
      typeToken_V0 = null;
   }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.util.Set<Boolean> set_T0 = boundStatement0.getSet(int0, typeToken_V0); 
  }

  @Test(groups = "unit")
  public void getSet3_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    com.google.common.reflect.TypeToken<Boolean> typeToken_V0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
      typeToken_V0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.util.Set<Boolean> set_T0 = boundStatement0.getSet(string0, typeToken_V0); 
  }

  @Test(groups = "unit")
  public void getSet3_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    com.google.common.reflect.TypeToken<Boolean> typeToken_V0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
      typeToken_V0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.util.Set<Boolean> set_T0 = boundStatement0.getSet(string0, typeToken_V0); 
  }

  @Test(groups = "unit")
  public void getString0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    String string0 = boundStatement0.getString(int0); 
  }

  @Test(groups = "unit")
  public void getString1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string2 = null;
      String string3 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string2, string3);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    String string1 = boundStatement0.getString(string0); 
  }

  @Test(groups = "unit")
  public void getString1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string2 = null;
      String string3 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string2, string3);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    String string1 = boundStatement0.getString(string0); 
  }

  @Test(groups = "unit")
  public void getTupleValue0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    TupleValue tupleValue0 = boundStatement0.getTupleValue(int0); 
  }

  @Test(groups = "unit")
  public void getTupleValue1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    TupleValue tupleValue0 = boundStatement0.getTupleValue(string0); 
  }

  @Test(groups = "unit")
  public void getTupleValue1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    TupleValue tupleValue0 = boundStatement0.getTupleValue(string0); 
  }

  @Test(groups = "unit")
  public void getUDTValue0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    UDTValue uDTValue0 = boundStatement0.getUDTValue(int0); 
  }

  @Test(groups = "unit")
  public void getUDTValue1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    UDTValue uDTValue0 = boundStatement0.getUDTValue(string0); 
  }

  @Test(groups = "unit")
  public void getUDTValue1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    UDTValue uDTValue0 = boundStatement0.getUDTValue(string0); 
  }

  @Test(groups = "unit")
  public void getUUID0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.util.UUID uUID0 = boundStatement0.getUUID(int0); 
  }

  @Test(groups = "unit")
  public void getUUID1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.util.UUID uUID0 = boundStatement0.getUUID(string0); 
  }

  @Test(groups = "unit")
  public void getUUID1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.util.UUID uUID0 = boundStatement0.getUUID(string0); 
  }

  @Test(groups = "unit")
  public void getVarint0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.math.BigInteger bigInteger0 = boundStatement0.getVarint(int0); 
  }

  @Test(groups = "unit")
  public void getVarint1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.math.BigInteger bigInteger0 = boundStatement0.getVarint(string0); 
  }

  @Test(groups = "unit")
  public void getVarint1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    java.math.BigInteger bigInteger0 = boundStatement0.getVarint(string0); 
  }

  @Test(groups = "unit")
  public void isNull0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    boolean null0 = boundStatement0.isNull(int0); 
  }

  @Test(groups = "unit")
  public void isNull1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    boolean null0 = boundStatement0.isNull(string0); 
  }

  @Test(groups = "unit")
  public void isNull1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    boolean null0 = boundStatement0.isNull(string0); 
  }

  @Test(groups = "unit")
  public void isSet0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement1 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement1);
      int0 = 0;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    boolean boolean0 = boundStatement0.isSet(int0); 
  }

  @Test(groups = "unit")
  public void isSet1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement1 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement1);
      string0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    boolean boolean0 = boundStatement0.isSet(string0); 
  }

  @Test(groups = "unit")
  public void isSet1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement1 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement1);
      string0 = "";
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    boolean boolean0 = boundStatement0.isSet(string0); 
  }

  @Test(groups = "unit")
  public void preparedStatement0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement1 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement1);
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    PreparedStatement preparedStatement0 = boundStatement0.preparedStatement(); 
  }

  @Test(groups = "unit")
  public void setBool0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    boolean boolean0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
      boolean0 = true;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setBool(int0, boolean0); 
  }

  @Test(groups = "unit")
  public void setBool1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    boolean boolean0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
      boolean0 = true;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setBool(string0, boolean0); 
  }

  @Test(groups = "unit")
  public void setBool1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    boolean boolean0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
      boolean0 = true;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setBool(string0, boolean0); 
  }

  @Test(groups = "unit")
  public void setBytes0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    java.nio.ByteBuffer byteBuffer0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
      byteBuffer0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setBytes(int0, byteBuffer0); 
  }

  @Test(groups = "unit")
  public void setBytes1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    java.nio.ByteBuffer byteBuffer0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
      byteBuffer0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setBytes(string0, byteBuffer0); 
  }

  @Test(groups = "unit")
  public void setBytes1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    java.nio.ByteBuffer byteBuffer0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
      byteBuffer0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setBytes(string0, byteBuffer0); 
  }

  @Test(groups = "unit")
  public void setBytesUnsafe0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    java.nio.ByteBuffer byteBuffer0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
      byteBuffer0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setBytesUnsafe(int0, byteBuffer0); 
  }

  @Test(groups = "unit")
  public void setBytesUnsafe1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    java.nio.ByteBuffer byteBuffer0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
      byteBuffer0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setBytesUnsafe(string0, byteBuffer0); 
  }

  @Test(groups = "unit")
  public void setBytesUnsafe1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    java.nio.ByteBuffer byteBuffer0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
      byteBuffer0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setBytesUnsafe(string0, byteBuffer0); 
  }

  @Test(groups = "unit")
  public void setDate0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    java.util.Date date0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
      date0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setDate(int0, date0); 
  }

  @Test(groups = "unit")
  public void setDate1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    java.util.Date date0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
      date0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setDate(string0, date0); 
  }

  @Test(groups = "unit")
  public void setDate1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    java.util.Date date0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
      date0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setDate(string0, date0); 
  }

  @Test(groups = "unit")
  public void setDecimal0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    java.math.BigDecimal bigDecimal0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
      bigDecimal0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setDecimal(int0, bigDecimal0); 
  }

  @Test(groups = "unit")
  public void setDecimal1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    java.math.BigDecimal bigDecimal0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
      bigDecimal0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setDecimal(string0, bigDecimal0); 
  }

  @Test(groups = "unit")
  public void setDecimal1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    java.math.BigDecimal bigDecimal0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
      bigDecimal0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setDecimal(string0, bigDecimal0); 
  }

  @Test(groups = "unit")
  public void setDouble0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    double double0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
      double0 = 0.0;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setDouble(int0, double0); 
  }

  @Test(groups = "unit")
  public void setDouble1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    double double0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
      double0 = 0.0;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setDouble(string0, double0); 
  }

  @Test(groups = "unit")
  public void setDouble1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    double double0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
      double0 = 0.0;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setDouble(string0, double0); 
  }

  @Test(groups = "unit")
  public void setFloat0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    float float0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
      float0 = 0.0f;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setFloat(int0, float0); 
  }

  @Test(groups = "unit")
  public void setFloat1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    float float0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
      float0 = 0.0f;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setFloat(string0, float0); 
  }

  @Test(groups = "unit")
  public void setFloat1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    float float0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
      float0 = 0.0f;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setFloat(string0, float0); 
  }

  @Test(groups = "unit")
  public void setInet0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    java.net.InetAddress inetAddress0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
      inetAddress0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setInet(int0, inetAddress0); 
  }

  @Test(groups = "unit")
  public void setInet1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    java.net.InetAddress inetAddress0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
      inetAddress0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setInet(string0, inetAddress0); 
  }

  @Test(groups = "unit")
  public void setInet1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    java.net.InetAddress inetAddress0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
      inetAddress0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setInet(string0, inetAddress0); 
  }

  @Test(groups = "unit")
  public void setInt0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    int int1;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
      int1 = 0;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setInt(int0, int1); 
  }

  @Test(groups = "unit")
  public void setInt1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    int int1;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
      int1 = 0;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setInt(int0, int1); 
  }

  @Test(groups = "unit")
  public void setList0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    java.util.List<Boolean> list_T0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
      list_T0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setList(int0, list_T0); 
  }

  @Test(groups = "unit")
  public void setList1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    java.util.List<Boolean> list_T0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
      list_T0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setList(string0, list_T0); 
  }

  @Test(groups = "unit")
  public void setList1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    java.util.List<Boolean> list_T0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
      list_T0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setList(string0, list_T0); 
  }

  @Test(groups = "unit")
  public void setLong0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    long long0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
      long0 = 0;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setLong(int0, long0); 
  }

  @Test(groups = "unit")
  public void setLong1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    long long0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
      long0 = 0;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setLong(string0, long0); 
  }

  @Test(groups = "unit")
  public void setLong1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    long long0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
      long0 = 0;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setLong(string0, long0); 
  }

  @Test(groups = "unit")
  public void setMap0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    java.util.Map<Boolean, Boolean> map_K_V0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
      map_K_V0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setMap(int0, map_K_V0); 
  }

  @Test(groups = "unit")
  public void setMap1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    java.util.Map<Boolean, Boolean> map_K_V0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
      map_K_V0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setMap(string0, map_K_V0); 
  }

  @Test(groups = "unit")
  public void setMap1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    java.util.Map<Boolean, Boolean> map_K_V0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
      map_K_V0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setMap(string0, map_K_V0); 
  }

  @Test(groups = "unit")
  public void setPartitionKeyToken0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    Token token0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      token0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setPartitionKeyToken(token0); 
  }

  @Test(groups = "unit")
  public void setPartitionKeyToken1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    Token token0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      token0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setPartitionKeyToken(token0); 
  }

  @Test(groups = "unit")
  public void setPartitionKeyToken1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    Token token0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      token0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setPartitionKeyToken(token0); 
  }

  @Test(groups = "unit")
  public void setRoutingKey0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    java.nio.ByteBuffer byteBuffer0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement1 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement1);
      byteBuffer0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setRoutingKey(byteBuffer0); 
  }

  @Test(groups = "unit")
  public void setSet0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    java.util.Set<Boolean> set_T0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
      set_T0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setSet(int0, set_T0); 
  }

  @Test(groups = "unit")
  public void setSet1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    java.util.Set<Boolean> set_T0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
      set_T0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setSet(string0, set_T0); 
  }

  @Test(groups = "unit")
  public void setSet1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    java.util.Set<Boolean> set_T0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
      set_T0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setSet(string0, set_T0); 
  }

  @Test(groups = "unit")
  public void setString0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
      string0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setString(int0, string0); 
  }

  @Test(groups = "unit")
  public void setString1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    String string1;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string2 = null;
      String string3 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string2, string3);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
      string1 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setString(string0, string1); 
  }

  @Test(groups = "unit")
  public void setString1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    String string1;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string2 = null;
      String string3 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string2, string3);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
      string1 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setString(string0, string1); 
  }

  @Test(groups = "unit")
  public void setToNull0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setToNull(int0); 
  }

  @Test(groups = "unit")
  public void setToNull1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setToNull(string0); 
  }

  @Test(groups = "unit")
  public void setToNull1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setToNull(string0); 
  }

  @Test(groups = "unit")
  public void setToken0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    Token token0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
      token0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setToken(int0, token0); 
  }

  @Test(groups = "unit")
  public void setToken1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    Token token0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
      token0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setToken(string0, token0); 
  }

  @Test(groups = "unit")
  public void setToken1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    Token token0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
      token0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setToken(string0, token0); 
  }

  @Test(groups = "unit")
  public void setTupleValue0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    TupleValue tupleValue0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
      tupleValue0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setTupleValue(int0, tupleValue0); 
  }

  @Test(groups = "unit")
  public void setTupleValue1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    TupleValue tupleValue0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
      tupleValue0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setTupleValue(string0, tupleValue0); 
  }

  @Test(groups = "unit")
  public void setTupleValue1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    TupleValue tupleValue0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
      tupleValue0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setTupleValue(string0, tupleValue0); 
  }

  @Test(groups = "unit")
  public void setUDTValue0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    UDTValue uDTValue0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
      uDTValue0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setUDTValue(int0, uDTValue0); 
  }

  @Test(groups = "unit")
  public void setUDTValue1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    UDTValue uDTValue0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
      uDTValue0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setUDTValue(string0, uDTValue0); 
  }

  @Test(groups = "unit")
  public void setUDTValue1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    UDTValue uDTValue0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
      uDTValue0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setUDTValue(string0, uDTValue0); 
  }

  @Test(groups = "unit")
  public void setUUID0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    java.util.UUID uUID0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
      uUID0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setUUID(int0, uUID0); 
  }

  @Test(groups = "unit")
  public void setUUID1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    java.util.UUID uUID0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
      uUID0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setUUID(string0, uUID0); 
  }

  @Test(groups = "unit")
  public void setUUID1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    java.util.UUID uUID0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
      uUID0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setUUID(string0, uUID0); 
  }

  @Test(groups = "unit")
  public void setVarint0_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    int int0;
    java.math.BigInteger bigInteger0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string0 = null;
      String string1 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string0, string1);
      boundStatement0 = new BoundStatement(preparedStatement0);
      int0 = 0;
      bigInteger0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setVarint(int0, bigInteger0); 
  }

  @Test(groups = "unit")
  public void setVarint1_Test0() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    java.math.BigInteger bigInteger0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = null;
      bigInteger0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setVarint(string0, bigInteger0); 
  }

  @Test(groups = "unit")
  public void setVarint1_Test1() throws TestSetupException
  {	
    //set up
    BoundStatement boundStatement0;
    String string0;
    java.math.BigInteger bigInteger0;
    try
    {
      byte[] byteArray0 = new byte[18];
      io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.copiedBuffer(byteArray0);
      ProtocolVersion protocolVersion1 = ProtocolVersion.NEWEST_SUPPORTED;
      Responses.Result.Prepared responses_Result_Prepared0 = (Responses.Result.Prepared)Responses.Result.Prepared.subcodec.decode(byteBuf0, protocolVersion1);
      Metadata metadata0 = null;
      ProtocolVersion protocolVersion0 = null; 
      String string1 = null;
      String string2 = null; 
      PreparedStatement preparedStatement0 = DefaultPreparedStatement.fromMessage(responses_Result_Prepared0, metadata0, protocolVersion0, string1, string2);
      boundStatement0 = new BoundStatement(preparedStatement0);
      string0 = "";
      bigInteger0 = null;
    }
    catch(Exception e)
    {
      throw new TestSetupException(e);
    }

    //run
    BoundStatement boundStatement1 = boundStatement0.setVarint(string0, bigInteger0); 
  }
}
