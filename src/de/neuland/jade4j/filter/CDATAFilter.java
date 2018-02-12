package de.neuland.jade4j.filter;

import java.util.List;
import java.util.Map;

import de.neuland.jade4j.parser.node.Attr;

public class CDATAFilter implements Filter {

	@Override
	public String convert(String source, List<Attr> attributes, Map<String, Object> model) {
		return "<![CDATA[" + source + "]]>";
	}

}