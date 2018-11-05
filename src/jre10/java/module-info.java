import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.d3.D3PageConfigurator;
import com.jwebmp.plugins.d3.implementations.D3ExclusionsModule;

module com.jwebmp.plugins.d3 {
	exports com.jwebmp.plugins.d3;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with D3PageConfigurator;

	provides IGuiceScanModuleExclusions with D3ExclusionsModule;
	provides IGuiceScanJarExclusions with D3ExclusionsModule;

}
