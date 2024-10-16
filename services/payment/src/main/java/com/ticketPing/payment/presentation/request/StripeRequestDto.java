package com.ticketPing.payment.presentation.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StripeRequestDto {

    private String performanceName;
    @Schema(description = "Time of the performance", example = "2024-12-24T20:00:00")
    private String performanceTime;
    private String seatInfo;
    @Schema(description = "price")
    private Long amount;
    private String userEmail;


}
