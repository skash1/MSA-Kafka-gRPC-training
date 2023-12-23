package com.example.manager

import com.example.model.account.Account
import com.example.model.parking.ParkPlace
import com.example.model.parking.Parking
import com.example.model.transport.Transport

interface ParkingManager {

    fun getParkPlace(parking: Parking, transport: Transport): ParkPlace?

    fun takeParkPlace(account: Account, parkPlace: ParkPlace, transport: Transport)

    fun releaseParkPlace(account: Account, parkPlace: ParkPlace, transport: Transport)

}
