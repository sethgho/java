package com.pubnub.api.tests;

import static org.junit.Assert.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import com.pubnub.api.Pubnub;
import com.pubnub.api.PubnubSync;

public class PublishTest {

    PubnubSync pubnub = new PubnubSync("demo", "demo");

    @Test
    public void String() {
        String message = "hi";
        String channel = "hello";
        try {
            JSONArray jso = (JSONArray) pubnub.publish(channel, message);
            assertEquals(jso.get(0), 1);
            assertEquals(jso.get(1), "Sent");
        } catch (JSONException e) {
            fail("Not an array response 1");
        } catch (ClassCastException c) {
            fail("Not an array response 2");
        }
    }

    @Test
    public void Integer() {
        Integer message = 123;
        String channel = "hello";
        try {
            JSONArray jso = (JSONArray) pubnub.publish(channel, message);
            assertEquals(jso.get(0), 1);
            assertEquals(jso.get(1), "Sent");
        } catch (JSONException e) {
            fail("Not an array response 1");
        } catch (ClassCastException c) {
            fail("Not an array response 2");
        }
    }

    @Test
    public void Double() {
        Double message = 1.2;
        String channel = "hello";
        try {
            JSONArray jso = (JSONArray) pubnub.publish(channel, message);
            assertEquals(jso.get(0), 1);
            assertEquals(jso.get(1), "Sent");
        } catch (JSONException e) {
            fail("Not an array response 1");
        } catch (ClassCastException c) {
            fail("Not an array response 2");
        }
    }

    @Test
    public void JsonArray() {
        JSONArray jsa = new JSONArray();
        jsa.put("a");
        jsa.put("b");
        String channel = "hello";
        try {
            JSONArray jso = (JSONArray) pubnub.publish(channel, jsa);
            assertEquals(jso.get(0), 1);
            assertEquals(jso.get(1), "Sent");
        } catch (JSONException e) {
            fail("Not an array response 1");
        } catch (ClassCastException c) {
            fail("Not an array response 2");
        }
    }

    @Test
    public void JsonObject() {
        JSONObject js = new JSONObject();
        try {
            js.put("a", 1);
            js.put("b", 2);
        } catch (JSONException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        String channel = "hello";
        try {
            JSONArray jso = (JSONArray) pubnub.publish(channel, js);
            assertEquals(jso.get(0), 1);
            assertEquals(jso.get(1), "Sent");
        } catch (JSONException e) {
            fail("Not an array response 1");
        } catch (ClassCastException c) {
            fail("Not an array response 2");
        }
    }
}
