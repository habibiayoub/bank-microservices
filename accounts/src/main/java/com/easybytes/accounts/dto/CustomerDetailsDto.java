package com.easybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer details",
        description = "Schema to hold Customer, Account, Card & Loan information"
)
public class CustomerDetailsDto {

    @Schema(
            description = "Name of the Customer",
            example = "Caroline Dupon"
    )
    @NotEmpty(message = "Name can not be null or empty")
    @Size(min = 5, max = 30, message = "The length of the customer name should be between 5 and 30")
    private String name;

    @Schema(
            description = "Email address of the Customer",
            example = "caroline.dupon@gmail.com"
    )
    @NotEmpty(message = "Mail can not be null or empty")
    @Email(message = "Email address should be at valid format")
    private String email;

    @Schema(
            description = "Mobile number of the Customer",
            example = "0666666666"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Account details of the Customer"
    )
    private AccountsDto accountsDto;

    @Schema(
            description = "Loan details of the Customer"
    )
    private LoansDto loansDto;

    @Schema(
            description = "Card details of the Customer"
    )
    private CardsDto cardsDto;

}
