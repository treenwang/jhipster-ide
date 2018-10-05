package io.github.jhipster.jdl.ui.codemining

import io.github.jhipster.jdl.jdl.JdlRelation
import org.eclipse.jface.text.BadLocationException
import org.eclipse.jface.text.IDocument
import org.eclipse.jface.text.codemining.ICodeMining
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.codemining.AbstractXtextCodeMiningProvider
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.jface.text.ITextViewer
import org.eclipse.core.runtime.IProgressMonitor

class JDLCodeMiningProvider extends AbstractXtextCodeMiningProvider {

	new() {
		val a = "test"
		println(a)
	}
	
	override provideCodeMinings(ITextViewer viewer, IProgressMonitor monitor) {
		super.provideCodeMinings(viewer, monitor)
	}

	override protected void createCodeMinings(IDocument document, XtextResource resource, CancelIndicator indicator,
		IAcceptor<? super ICodeMining> acceptor) throws BadLocationException {
		val relations = EcoreUtil2.eAllOfType(resource.contents.head, JdlRelation)
		if (relations.isNullOrEmpty) return;
		relations.forEach[ rel |
			val count = relations.filter[it.entity === rel.entity].length
			val text = "reference " + count
			val mining = createNewLineHeaderCodeMining(0, document, text)
			acceptor.accept(mining)
		]
	}
	
	override protected createNewLineHeaderCodeMining(int beforeLineNumber, IDocument document, String headerText) throws BadLocationException {
		super.createNewLineHeaderCodeMining(beforeLineNumber, document, headerText)
	}
	
}
