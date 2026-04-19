package presentation.screens

import androidx.compose.remote.core.RcPlatformServices
import androidx.compose.remote.creation.RemoteComposeContext
import androidx.compose.remote.creation.RemoteComposeWriter
import androidx.compose.remote.creation.profile.Profile
import androidx.compose.remote.creation.profile.RemoteComposeWriterFactory
import presentation.ui.BackgroundColor
import presentation.components.main_components.pricingTopBarWithIndicator
import presentation.components.main_components.subscriptionCard

fun subscriptionScreen(): ByteArray {
    val platform = object : RcPlatformServices {
        override fun imageToByteArray(image: Any): ByteArray? = null
        override fun getImageWidth(image: Any): Int = 0
        override fun getImageHeight(image: Any): Int = 0
        override fun isAlpha8Image(image: Any): Boolean = false
        override fun pathToFloatArray(path: Any): FloatArray? = null
        override fun parsePath(pathData: String): Any = ""
        override fun log(category: RcPlatformServices.LogCategory, message: String) = println(message)
    }

    val factory = RemoteComposeWriterFactory { info, profile, _ ->
        RemoteComposeWriter(
            info,
            "SubscriptionScreen",
            profile
        )
    }

    val profile = Profile(
        37,
        1,
        platform,
        factory
    )

    val context = RemoteComposeContext(
        1000,
        1000,
        "SubscriptionScreen",
        profile
    )

    context.apply {
        root {
            column(
                modifier = Modifier
                    .background(BackgroundColor)
                    .padding(50, 36, 50, 36)
            ) {
                pricingTopBarWithIndicator()

                subscriptionCard(
                    onPurchase = {}
                )
            }
        }
    }

    return context.writer.encodeToByteArray()
}