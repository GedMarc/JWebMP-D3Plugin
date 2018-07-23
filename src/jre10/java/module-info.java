import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.d3.D3PageConfigurator;

module com.jwebmp.components.d3 {
	exports com.jwebmp.plugins.d3;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;

	provides IPageConfigurator with D3PageConfigurator;

}
