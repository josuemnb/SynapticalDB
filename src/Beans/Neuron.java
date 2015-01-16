package Beans;

public class Neuron {
	private long id;
	private long parent;
	private long child;
	private long [] related;
	private String date;
	private long size;
	private String description;
	private byte [] content;
	
	public Neuron(long parent) {
		this(parent,0);
	}
	
	public Neuron(long parent, int size) {
		id=System.currentTimeMillis();
		if(size>0) {
			content = new byte[size];
			this.size=size;
		}
	}
	
	public int add(byte[] content, String description) {
		
		return 1;
	}
	
	public long getParent() {
		return parent;
	}

	public void setParent(long parent) {
		this.parent = parent;
	}

	public long getChild() {
		return child;
	}

	public void setChild(long child) {
		this.child = child;
	}

	public long[] getRelated() {
		return related;
	}

	public void setRelated(long[] related) {
		this.related = related;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}

	public long getId() {
		return id;
	}
}
