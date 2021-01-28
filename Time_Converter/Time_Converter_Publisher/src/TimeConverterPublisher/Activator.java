package TimeConverterPublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	 ServiceRegistration publishServiceRegistration;

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		
		//Activator.context = bundleContext;
		System.out.println("Publisher Start");
		TimePublish publisherService = new TimePublishImpl();
		publishServiceRegistration = bundleContext.registerService(TimePublish.class.getName(),publisherService,null);
		
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		//Activator.context = null;
		System.out.println("Publisher Stop");
		publishServiceRegistration.unregister();
	}

}
