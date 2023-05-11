package com.appiwedia.apps.android.algoapp.data.models

import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class WalletAccount(
    val account: Account,
    @SerializedName("current-round")
    val currentRound: Long
): Parcelable

@Parcelize
data class Account(
    val address: String,
    val amount: Long,

    @SerializedName("amount-without-pending-rewards")
    val amountWithoutPendingRewards: Long,

    @SerializedName("created-at-round")
    val createdAtRound: Long,

    val deleted: Boolean,

    @SerializedName("pending-rewards")
    val pendingRewards: Long,

    @SerializedName("reward-base")
    val rewardBase: Long,

    val rewards: Long,
    val round: Long,

    @SerializedName("sig-type")
    val sigType: String,

    val status: String
): Parcelable
