package pl.liquidkit.springinaction4.chapter03.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

/**
 * Created by Jacek on 2016-01-08.
 */
@Configuration
@ComponentScan
public class ScopeConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Notepad notepad() {
        return new Notepad();
    }

    @Bean
    @Scope(
            value = "session", // WebApplicationContext.SCOPE_SESSION
            proxyMode = ScopedProxyMode.INTERFACES
    )
    public ShoppingCart shoppingCart() {
        return new ShoppingCart();
    }
}
