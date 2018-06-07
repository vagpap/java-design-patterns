package gr.wackydevelopers.patterns.behavioral.singleton;

public class LazyInitSingleton {

	private static LazyInitSingleton _instance;

	private LazyInitSingleton() {
	};

	public static LazyInitSingleton getInstance() {
		if (_instance == null) {
			_instance = new LazyInitSingleton();
		}
		return _instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Singleton cannot be cloned");
	}
}
