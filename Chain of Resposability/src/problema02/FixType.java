package problema02;

public enum FixType {
	a(new ToolA()),b(new ToolB()),c(new ToolC());
	private Tool tool;

	private FixType(Tool tool) {
		this.tool = tool;
	}

	public void fix(Request request) {
		tool.fix(request);
	}
	
	
}
