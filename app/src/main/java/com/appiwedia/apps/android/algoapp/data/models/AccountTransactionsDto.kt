package com.appiwedia.apps.android.algoapp.data.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class AccountTransactionsDto(
    @SerializedName("next-token")
    val nextToken: String,

    @SerializedName("current-round")
    val currentRound: Long,

    val transactions: List<Transactions>
) : Parcelable

@Parcelize
data class Transactions(
    val note: String,
    val signature: Signature,
    val fee: Long,

    @SerializedName("created-application-index")
    val createdApplicationIndex: Long,

    @SerializedName("local-state-delta")
    val localStateDelta: List<LocalStateDelta>,

    @SerializedName("closing-amount")
    val closingAmount: Long,

    @SerializedName("asset-transfer-transaction")
    val assetTransferTransaction: AssetTransferTransaction,

    @SerializedName("genesis-hash")
    val genesisHash: String,

    @SerializedName("intra-round-offset")
    val intraRoundOffset: Long,

    @SerializedName("asset-freeze-transaction")
    val assetFreezeTransaction: AssetFreezeTransaction,

    @SerializedName("asset-config-transaction")
    val assetConfigTransaction: AssetConfigTransaction,

    @SerializedName("payment-transaction")
    val paymentTransaction: PaymentTransaction,

    val id: String,

    @SerializedName("created-asset-index")
    val createdAssetIndex: Long,

    @SerializedName("keyreg-transaction")
    val keyregTransaction: KeyregTransaction,

    @SerializedName("last-valid")
    val lastValid: Long,

    val group: String,

    @SerializedName("round-time")
    val roundTime: Long,

    @SerializedName("receiver-rewards")
    val receiverRewards: Long,

    @SerializedName("rekey-to")
    val rekeyTo: String,

    @SerializedName("confirmed-round")
    val confirmedRound: Long,

    @SerializedName("tx-type")
    val txType: String,

    @SerializedName("sender-rewards")
    val senderRewards: Long,

    @SerializedName("application-transaction")
    val applicationTransaction: ApplicationTransaction,

    val sender: String,

    @SerializedName("first-valid")
    val firstValid: Long,

    val lease: String,

    @SerializedName("genesis-id")
    val genesisID: String,

    @SerializedName("close-rewards")
    val closeRewards: Long,

    @SerializedName("auth-addr")
    val authAddr: String,

    @SerializedName("global-state-delta")
    val globalStateDelta: List<Delta>
) : Parcelable

@Parcelize
data class ApplicationTransaction(
    @SerializedName("clear-state-program")
    val clearStateProgram: String,

    @SerializedName("local-state-schema")
    val localStateSchema: AlStateSchema,

    @SerializedName("foreign-apps")
    val foreignApps: List<Long>,

    @SerializedName("approval-program")
    val approvalProgram: String,

    @SerializedName("application-args")
    val applicationArgs: List<String>,

    @SerializedName("foreign-assets")
    val foreignAssets: List<Long>,

    val accounts: List<String>,

    @SerializedName("on-completion")
    val onCompletion: String,

    @SerializedName("application-id")
    val applicationID: Long,

    @SerializedName("global-state-schema")
    val globalStateSchema: AlStateSchema
) : Parcelable

@Parcelize
data class AlStateSchema(
    @SerializedName("num-uint")
    val numUint: Long,

    @SerializedName("num-byte-slice")
    val numByteSlice: Long
) : Parcelable

@Parcelize
data class AssetConfigTransaction(
    @SerializedName("asset-id")
    val assetID: Long,

    val params: Params
) : Parcelable

@Parcelize
data class Params(
    val clawback: String,

    @SerializedName("default-frozen")
    val defaultFrozen: Boolean,

    val creator: String,
    val total: Long,

    @SerializedName("unit-name")
    val unitName: String,

    val freeze: String,
    val manager: String,
    val decimals: Long,
    val name: String,
    val reserve: String,

    @SerializedName("metadata-hash")
    val metadataHash: String,

    val url: String
) : Parcelable

@Parcelize
data class AssetFreezeTransaction(
    val address: String,

    @SerializedName("asset-id")
    val assetID: Long,

    @SerializedName("new-freeze-status")
    val newFreezeStatus: Boolean
) : Parcelable

@Parcelize
data class AssetTransferTransaction(
    @SerializedName("close-amount")
    val closeAmount: Long,

    val amount: Long,

    @SerializedName("close-to")
    val closeTo: String,

    val receiver: String,
    val sender: String,

    @SerializedName("asset-id")
    val assetID: Long
) : Parcelable

@Parcelize
data class Delta(
    val value: String,
    val key: String
) : Parcelable

@Parcelize
data class KeyregTransaction(
    @SerializedName("non-participation")
    val nonParticipation: Boolean,
    @SerializedName("vote-participation-key")
    val voteParticipationKey: String,

    @SerializedName("vote-last-valid")
    val voteLastValid: Long,

    @SerializedName("vote-key-dilution")
    val voteKeyDilution: Long,

    @SerializedName("vote-first-valid")
    val voteFirstValid: Long,

    @SerializedName("selection-participation-key")
    val selectionParticipationKey: String
) : Parcelable

@Parcelize
data class LocalStateDelta(
    val address: String,
    val delta: List<Delta>
) : Parcelable

@Parcelize
data class PaymentTransaction(
    @SerializedName("close-amount")
    val closeAmount: Long,

    val amount: Long,
    val receiver: String,

    @SerializedName("close-remainder-to")
    val closeRemainderTo: String
) : Parcelable

@Parcelize
data class Signature(
    val sig: String,
    val multisig: Multisig,
    val logicsig: Logicsig
) : Parcelable

@Parcelize
data class Logicsig(
    val args: List<String>,

    @SerializedName("multisig-signature")
    val multisigSignature: Multisig,

    val signature: String,
    val logic: String
) : Parcelable

@Parcelize
data class Multisig(
    val subsignature: List<Subsignature>,
    val threshold: Long,
    val version: Long
) : Parcelable

@Parcelize
data class Subsignature(
    val signature: String,
    @SerializedName("public-key")
    val publicKey: String
) : Parcelable