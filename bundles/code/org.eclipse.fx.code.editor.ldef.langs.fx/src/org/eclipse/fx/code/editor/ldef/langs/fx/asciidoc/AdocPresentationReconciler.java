package org.eclipse.fx.code.editor.ldef.langs.fx.asciidoc;

public class AdocPresentationReconciler extends org.eclipse.jface.text.presentation.PresentationReconciler {
	public AdocPresentationReconciler() {
		org.eclipse.jface.text.rules.DefaultDamagerRepairer __dftl_partition_content_typeDamageRepairer = new org.eclipse.jface.text.rules.DefaultDamagerRepairer(new Adoc__dftl_partition_content_type());
		setDamager(__dftl_partition_content_typeDamageRepairer, "__dftl_partition_content_type");
		setRepairer(__dftl_partition_content_typeDamageRepairer, "__dftl_partition_content_type");
		org.eclipse.jface.text.rules.DefaultDamagerRepairer __adoc_multiline_commentDamageRepairer = new org.eclipse.jface.text.rules.DefaultDamagerRepairer(new Adoc__adoc_multiline_comment());
		setDamager(__adoc_multiline_commentDamageRepairer, "__adoc_multiline_comment");
		setRepairer(__adoc_multiline_commentDamageRepairer, "__adoc_multiline_comment");
		org.eclipse.jface.text.rules.DefaultDamagerRepairer __adoc_singleline_commentDamageRepairer = new org.eclipse.jface.text.rules.DefaultDamagerRepairer(new Adoc__adoc_singleline_comment());
		setDamager(__adoc_singleline_commentDamageRepairer, "__adoc_singleline_comment");
		setRepairer(__adoc_singleline_commentDamageRepairer, "__adoc_singleline_comment");
	}
}