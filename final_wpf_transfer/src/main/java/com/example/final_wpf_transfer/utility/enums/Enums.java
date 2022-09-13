package com.example.final_wpf_transfer.utility.enums;

public class Enums {

    public enum ActivityType{
        None,
        SearchCustomer,
        SelectCustomer,
        CheckSign,
        PreTransfer,
        CompleteTransfer
    } 

    public enum ActivityStatus{
        None,
        Success,
        Failed
    }

    public enum FromWalletType{
        UNKNOW_WALLET_TYPE,
        SAVING_DEPOSIT_ACCOUNT,
        FIXED_DEPOSIT_ACCOUNT,
        LOAN_ACCOUNT,
        None4,
        None5,
        None6,
        None7,
        None8,
        None9,
        RSM,
        GF,
        EF,
        RF,
        VF,
        KPLUS,
        BOONTERM,
        SCB
    }

}
