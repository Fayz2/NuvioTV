package com.nuvio.tv.updater

internal object UpdateBannerPolicy {
    fun shouldShow(
        isRemoteNewer: Boolean,
        force: Boolean,
        bannerEnabled: Boolean,
        dismissedTag: String?,
        updateTag: String
    ): Boolean {
        return false
    }
}
