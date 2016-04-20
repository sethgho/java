package com.pubnub.api.core.models.consumer_facing;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

import java.util.Map;

@Getter
@Builder
public class PNAccessManagerGrantData {

    String level;
    int ttl;

    @JsonProperty("subscribe_key")
    String subscribeKey;

    Map<String, PNAccessManagerKeysData> channels;

    @JsonProperty("channel-groups")
    Map<String, PNAccessManagerKeysData> channelGroups;
}
