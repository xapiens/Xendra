#!/bin/bash
# terminar si algun proceso regresa un valor diferente a zero
set -e 
# tratar variables no definidas como error
set -u 

export PGHOST=${PGHOST-localhost}
export PGPORT=${PGPORT-5432}
export PGDATABASE=${PGDATABASE-core}
export PGUSER=${PGUSER-postgres}
export PGPASSWORD=${PGPASSWORD-postgres}
if [ ! -e ./sedfile.lock ]
then
        user=postgres
        user_home=$(awk -v u="$user" -v FS=':' '$1==u {print $6}' /etc/passwd)
	if [ -e ./copytablestemplate.sql ]
	then
		if [ -e ./copytables.sql ]
		then
			rm ./copytables.sql
		fi
		cp ./copytablestemplate.sql copytables.sql
	fi
	if [ -e ./tablesmovetemplate.sh ]
	then
		if [ -e -/tablesmove.sh ]
		then
			rm ./tablesmove.sh
		fi
		cp ./tablesmovetemplate.sh tablesmove.sh
	fi
        sed -i "s~PGDIR~$user_home~g" copytables.sql
	sed -i "s~PGDIR~$user_home~g" tablesmove.sh
        touch ./sedfile.lock
fi
if [ -e ./corestrucs.sql ]
then
        rm ./corestrucs.sql
fi
if [ -e ./createtables.zip ]
then
        rm ./createtables.zip
fi
RUN_PGDUMP="pg_dump --format plain --schema-only --encoding UTF8 --verbose --file ./corestrucs.sql core"
RUN_PSQL="psql -X --set AUTOCOMMIT=off --set ON_ERROR_STOP=on -f copytables.sql"
if [ -e ./filltables.zip ]
then
	rm ./filltables.zip
fi
if [ -e ./ad_client.csv ] 
then
	rm ./ad_client.csv
fi
if [ -e ./ad_clientinfo.csv ] 
then
	rm ./ad_clientinfo.csv
fi
if [ -e ./ad_org.csv ]
then
	rm ./ad_org.csv
fi
if [ -e ./ad_role.csv ]
then
	rm ./ad_role.csv
fi
if [ -e ./ad_role_orgaccess.csv ]
then
	rm ./ad_role_orgaccess.csv
fi
if [ -e ./ad_element.csv ]
then
	rm ./ad_element.csv
fi
if [ -e ./ad_element_trl.csv ]
then
	rm ./ad_element_trl.csv
fi
if [ -e ./ad_reference.csv ]
then 
	rm ./ad_reference.csv
fi
if [ -e ./ad_reference_trl.csv ]
then 
	rm ./ad_reference_trl.csv
fi
if [ -e ./ad_ref_list.csv ]
then
	rm ./ad_ref_list.csv
fi
if [ -e ./ad_ref_list_trl.csv ]
then
	rm ./ad_ref_list_trl.csv
fi
if [ -e ./ad_ref_table.csv ]
then
	rm ./ad_ref_table.csv
fi
if [ -e ./ad_image.csv ]
then
	rm ./ad_image.csv
fi
if [ -e ./ad_window.csv ]
then
	rm ./ad_window.csv
fi
if [ -e ./ad_window_trl.csv ]
then
	rm ./ad_window_trl.csv
fi
if [ -e ./ad_val_rule.csv ]
then
	rm ./ad_val_rule.csv
fi
if [ -e ./ad_reportview.csv ]
then
	rm ./ad_reportview.csv
fi
if [ -e ./ad_printfont.csv ]
then
	rm ./ad_printfont.csv
fi 
if [ -e ./ad_printcolor.csv ]
then
	rm ./ad_printcolor.csv
fi
if [ -e ./ad_printtableformat.csv ]
then
	rm ./ad_printtableformat.csv
fi
if [ -e ./c_bp_doctype.csv ]
then
	rm ./c_bp_doctype.csv
fi
if [ -e ./ad_printpaper.csv ]
then
	rm ./ad_printpaper.csv
fi
if [ -e ./ad_printformat.csv ]
then
	rm ./ad_printformat.csv
fi
if [ -e ./ad_process.csv ]
then
	rm ./ad_process.csv
fi
if [ -e ./ad_process_para.csv ]
then
	rm ./ad_process_para.csv
fi
if [ -e ./ad_process_para_trl.csv ]
then
	rm ./ad_process_para_trl.csv
fi
if [ -e ./ad_process_trl.csv ]
then
	rm ./ad_process_trl.csv
fi
if [ -e ./ad_package.csv ]
then
	rm ./ad_package.csv
fi
if [ -e ./ad_table.csv ]
then
	rm ./ad_table.csv
fi
if [ -e ./ad_table_trl.csv ]
then
	rm ./ad_table_trl.csv
fi
if [ -e ./ad_column.csv ]
then
	rm ./ad_column.csv
fi
if [ -e ./ad_column_trl.csv ]
then
	rm ./ad_column_trl.csv
fi
if [ -e ./c_currency.csv ] 
then
	rm ./c_currency.csv
fi
if [ -e ./c_city.csv ]
then
	rm ./c_city.csv
fi
if [ -e ./c_region.csv ]
then
	rm ./c_region.csv
fi
if [ -e ./c_country.csv ]
then
	rm ./c_country.csv
fi
if [ -e ./ad_language.csv ]
then
	rm ./ad_language.csv
fi
if [ -e ./ad_system.csv ]
then
	rm ./ad_system.csv
fi
if [ -e ./ad_user.csv ]
then
	rm ./ad_user.csv
fi
if [ -e ./ad_user_roles.csv ]
then
	rm ./ad_user_roles.csv
fi
if [ -e ./subject.csv ]
then
	rm ./subject.csv
fi
if [ -e ./ad_preference.csv ]
then
	rm ./ad_preference.csv
fi
if [ -e ./ad_impformat.csv ]
then
	rm ./ad_impformat.csv
fi
if [ -e ./ad_impformat_row.csv ]
then
	rm ./ad_impformat_row.csv
fi
# fill of app
if [ -e ./ad_menu.csv ]
then
	rm ./ad_menu.csv
fi
if [ -e ./ad_menu_trl.csv ]
then
	rm ./ad_menu_trl.csv
fi
if [ -e ./ad_form.csv ]
then
	rm ./ad_form.csv
fi
if [ -e ./ad_form_trl.csv ]
then
	rm ./ad_form_trl.csv
fi
if [ -e ./ad_tab.csv ]
then
	rm ./ad_tab.csv
fi
if [ -e ./ad_tab_trl.csv ]
then
	rm ./ad_tab_trl.csv
fi
if [ -e ./ad_field.csv ]
then
	rm ./ad_field.csv
fi
if [ -e ./ad_field_trl.csv ]
then
	rm ./ad_field_trl.csv
fi
#if [ -e ./ad_fieldgroup.csv ]
#then
#	rm ./ad_fieldgroup.csv
#fi
if [ -e ./ad_fieldgroup_trl.csv ]
then
	rm ./ad_fieldgroup_trl.csv
fi
if [ -e ./ad_entitytype.csv ]
then
	rm ./ad_entitytype.csv
fi
if [ -e ./ad_wf_responsible.csv ]
then
	rm ./ad_wf_responsible.csv
fi
if [ -e ./ad_workbench.csv ]
then
	rm ./ad_workbench.csv
fi
if [ -e ./ad_task.csv ]
then
	rm ./ad_task.csv
fi
if [ -e ./ad_tree.csv ]
then
	rm ./ad_tree.csv
fi
if [ -e ./ad_treebar.csv ]
then
	rm ./ad_treebar.csv
fi
if [ -e ./ad_treenode.csv ]
then
	rm ./ad_treenode.csv
fi
if [ -e ./ad_treenodebp.csv ]
then
	rm ./ad_treenodebp.csv
fi
if [ -e ./ad_treenodemm.csv ]
then
	rm ./ad_treenodemm.csv
fi
if [ -e ./ad_message.csv ]
then
	rm ./ad_message.csv
fi
if [ -e ./ad_message_trl.csv ]
then
	rm ./ad_message_trl.csv
fi
if [ -e ./c_uom.csv ]
then
	rm ./c_uom.csv
fi
if [ -e ./c_uom_trl.csv ]
then
	rm ./c_uom_trl.csv
fi
if [ -e ./ad_workflow_access.csv ]
then
	rm ./ad_workflow_access.csv
fi
if [ -e ./ad_task_access.csv ]
then
	rm ./ad_task_access.csv
fi
if [ -e ./ad_form_access.csv ]
then
	rm ./ad_form_access.csv
fi
if [ -e ./ad_tool_access.csv ]
then
	rm ./ad_tool_access.csv
fi
if [ -e ./ad_private_access.csv ]
then
	rm ./ad_private_access.csv
fi
if [ -e ./ad_column_access.csv ]
then
	rm ./ad_column_access.csv
fi
if [ -e ./ad_plugin_access.csv ]
then
	rm ./ad_plugin_access.csv
fi
if [ -e ./ad_process_access.csv ]
then
	rm ./ad_process_access.csv
fi
if [ -e ./ad_record_access.csv ]
then
	rm ./ad_record_access.csv
fi
if [ -e ./ad_window_access.csv ]
then
	rm ./ad_window_access.csv
fi
if [ -e ./ad_table_access.csv ]
then
	rm ./ad_table_access.csv
fi
if [ -e ./c_bp_group.csv ]
then
	rm ./c_bp_group.csv
fi
if [ -e ./m_product_category.csv ]
then
	rm ./m_product_category.csv
fi
if [ -e ./m_attributeset.csv ]
then
	rm ./m_attributeset.csv
fi
if [ -e ./m_attributesetinstance.csv ]
then
	rm ./m_attributesetinstance.csv
fi
if [ -e ./ad_plugin.csv ]
then
	rm ./ad_plugin.csv
fi
if [ -e ./a_printerdriver.csv ]
then
	rm ./a_printerdriver.csv
fi
if [ -e ./c_tax.csv ]
then
	rm ./c_tax.csv
fi
if [ -e ./c_tax_trl.csv ]
then
	rm ./c_tax_trl.csv
fi
if [ -e ./c_taxcategory.csv ]
then
	rm ./c_taxcategory.csv
fi
if [ -e ./c_taxcategory_trl.csv ]
then
	rm ./c_taxcategory_trl.csv
fi
if [ -e ./ad_workflow.csv ]
then
	rm ./ad_workflow.csv
fi
if [ -e ./ad_workflow_trl.csv ]
then
	rm ./ad_workflow_trl.csv
fi
if [ -e ./ad_wf_node.csv ]
then
	rm ./ad_wf_node.csv
fi
if [ -e ./ad_wf_node_trl.csv ]
then
	rm ./ad_wf_node_trl.csv
fi
if [ -e ./ad_wf_responsible.csv ]
then
	rm ./ad_wf_responsible.csv
fi
if [ -e ./ad_wf_nodenext.csv ]
then
	rm ./ad_wf_nodenext.csv
fi
if [ -e ./c_conversiontype.csv ]
then
	rm ./c_conversiontype.csv
fi
if [ -e ./c_doctype.csv ]
then
	rm ./c_doctype.csv
fi
if [ -e ./c_documenttax.csv ]
then
	rm ./c_documenttax.csv
fi
${RUN_PGDUMP}
zip ./createtables.zip corestrucs.sql
${RUN_PSQL}
./tablesmove.sh
zip ./filltables.zip ad_client.csv ad_clientinfo.csv ad_org.csv ad_role.csv ad_role_orgaccess.csv ad_reference.csv ad_ref_list.csv ad_ref_list_trl.csv ad_ref_table.csv ad_element.csv ad_image.csv ad_window.csv ad_val_rule.csv ad_reportview.csv ad_printfont.csv ad_printcolor.csv ad_printtableformat.csv ad_printpaper.csv ad_printformat.csv ad_process.csv ad_process_trl.csv ad_table.csv ad_package.csv ad_column.csv ad_message.csv ad_message_trl.csv ad_language.csv c_currency.csv c_city.csv c_region.csv c_country.csv ad_system.csv ad_user.csv ad_user_roles.csv c_subject.csv ad_preference.csv ad_impformat.csv ad_impformat_row.csv ad_menu.csv ad_form.csv ad_tab.csv ad_tab_trl.csv ad_field.csv ad_field_trl.csv ad_fieldgroup.csv ad_workflow.csv ad_wf_responsible.csv ad_entitytype.csv ad_workbench.csv ad_task.csv ad_tree.csv ad_treenode.csv ad_treenodebp.csv ad_treenodemm.csv c_uom.csv c_uom_trl.csv ad_workflow_access.csv ad_task_access.csv ad_form_access.csv ad_tool_access.csv ad_private_access.csv ad_column_access.csv ad_plugin_access.csv ad_process_access.csv ad_record_access.csv ad_window_access.csv ad_table_access.csv ad_menu_trl.csv m_product_category.csv m_attributeset.csv m_attributesetinstance.csv ad_plugin.csv ad_window_trl.csv a_printerdriver.csv ad_process_para.csv ad_process_para_trl.csv ad_reference_trl.csv ad_table_trl.csv ad_column_trl.csv ad_element_trl.csv ad_fieldgroup_trl.csv ad_form_trl.csv ad_wf_node.csv ad_wf_node_trl.csv ad_wf_responsible.csv ad_wf_nodenext.csv c_doctype.csv c_bp_doctype.csv c_conversiontype.csv c_tax.csv c_tax_trl.csv c_taxcategory.csv c_taxcategory_trl.csv c_documenttax.csv
