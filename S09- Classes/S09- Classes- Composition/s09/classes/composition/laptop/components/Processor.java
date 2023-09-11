package s09.classes.composition.laptop.components;

public class Processor {
	private String brand;
	private String series;
	private String cacheMemory;
	private String frequency;
	private String minFreq;
	private String maxFreq;
	private int generation;
	private int cores;
	private int threads;
	
	public Processor() {
		this.brand = "unknown";
		this.series = "unknown";
		this.cacheMemory = "unknown";
		this.frequency = "unknown";
		this.minFreq = "unknown";
		this.maxFreq = "unknown";
		this.generation = 0;
		this.cores = 0;
		this.threads = 0;
	}

	public Processor(String brand, String series, String cacheMemory, String frequency, String minFreq, String maxFreq,
			int generation, int cores, int threads) {
		this.brand = brand;
		this.series = series;
		this.cacheMemory = cacheMemory;
		this.frequency = frequency;
		this.minFreq = minFreq;
		this.maxFreq = maxFreq;
		this.generation = generation;
		this.cores = cores;
		this.threads = threads;
	}

	
	public String toString() {
		return "Processor [getBrand()=" + getBrand() + ", getSeries()=" + getSeries() + ", getCacheMemory()="
				+ getCacheMemory() + ", getFrequency()=" + getFrequency() + ", getMinFreq()=" + getMinFreq()
				+ ", getMaxFreq()=" + getMaxFreq() + ", getGeneration()=" + getGeneration() + ", getCores()="
				+ getCores() + ", getThreads()=" + getThreads() + "]";
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the series
	 */
	public String getSeries() {
		return series;
	}

	/**
	 * @param series the series to set
	 */
	public void setSeries(String series) {
		this.series = series;
	}

	/**
	 * @return the cacheMemory
	 */
	public String getCacheMemory() {
		return cacheMemory;
	}

	/**
	 * @param cacheMemory the cacheMemory to set
	 */
	public void setCacheMemory(String cacheMemory) {
		this.cacheMemory = cacheMemory;
	}

	/**
	 * @return the frequency
	 */
	public String getFrequency() {
		return frequency;
	}

	/**
	 * @param frequency the frequency to set
	 */
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	/**
	 * @return the minFreq
	 */
	public String getMinFreq() {
		return minFreq;
	}

	/**
	 * @param minFreq the minFreq to set
	 */
	public void setMinFreq(String minFreq) {
		this.minFreq = minFreq;
	}

	/**
	 * @return the maxFreq
	 */
	public String getMaxFreq() {
		return maxFreq;
	}

	/**
	 * @param maxFreq the maxFreq to set
	 */
	public void setMaxFreq(String maxFreq) {
		this.maxFreq = maxFreq;
	}

	/**
	 * @return the generation
	 */
	public int getGeneration() {
		return generation;
	}

	/**
	 * @param generation the generation to set
	 */
	public void setGeneration(int generation) {
		this.generation = generation;
	}

	/**
	 * @return the cores
	 */
	public int getCores() {
		return cores;
	}

	/**
	 * @param cores the cores to set
	 */
	public void setCores(int cores) {
		this.cores = cores;
	}

	/**
	 * @return the threads
	 */
	public int getThreads() {
		return threads;
	}

	/**
	 * @param threads the threads to set
	 */
	public void setThreads(int threads) {
		this.threads = threads;
	}
	
	
}
