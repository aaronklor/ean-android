/*
 * Copyright 2013 EAN.com, L.P. All rights reserved.
 */

package com.ean.mobile.hotel.request;

import org.joda.time.LocalDate;
import org.junit.Test;

import com.ean.mobile.hotel.HotelList;
import com.ean.mobile.hotel.RoomOccupancy;
import com.ean.mobile.request.DateModifier;
import com.ean.mobile.request.RequestTestBase;

import static org.junit.Assert.assertNull;

public class ListRequestTest extends RequestTestBase {

    private static final RoomOccupancy OCCUPANCY = new RoomOccupancy(1, null);

    @Test
    public void testConsumeNull() throws Exception {
        LocalDate[] dateTimes = DateModifier.getAnArrayOfLocalDatesWithOffsets(1, 3);
        ListRequest listRequest = new ListRequest("rome, it", OCCUPANCY, dateTimes[0], dateTimes[1]);

        HotelList hotelList = listRequest.consume(null);

        assertNull(hotelList);
    }
}