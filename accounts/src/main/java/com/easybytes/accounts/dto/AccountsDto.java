package com.easybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @Schema(
            description = "Account number of Easy Bank Account",
            example = "9999999999"
    )
    @NotEmpty(message = "Account number can not be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number number must be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account type of Easy Bank Account",
            example = "Savings"
    )
    @NotEmpty(message = "Account type number can not be null or empty")
    private String accountType;

    @Schema(
            description = "Easy Bank branch address",
            example = "123 New York"
    )
    @NotEmpty(message = "Branch address number can not be null or empty")
    private String branchAddress;

}
