package com.example.advai.mqttawsiotmosquitosimpleconnection;

import com.amazonaws.regions.Regions;

/**
 * Created by advait on 1/29/2018.
 */

public class Constants {
    // --- Constants to modify per your configuration ---

    // Customer specific IoT endpoint
    // AWS Iot CLI describe-endpoint call returns: XXXXXXXXXX.iot.<region>.amazonaws.com,
    public static final String CUSTOMER_SPECIFIC_ENDPOINT = "XXXXXXXXXXXX.iot.us-east-1.amazonaws.com";

    // Cognito pool ID. For this app, pool needs to be unauthenticated pool with
    // AWS IoT permissions.
    public static final String COGNITO_POOL_ID = "us-east-1:XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX";

    // Region of AWS IoT
    public static final Regions MY_REGION = Regions.US_EAST_1;
}
