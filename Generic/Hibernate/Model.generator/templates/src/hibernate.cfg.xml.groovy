copy to your hibernate.cfg.xml:

	
<hibernate-configuration>
	<session-factory>
	
		...
		
 		<mapping class="${basePackage}.model.${modelName}" />

		...

	</session-factory>
</hibernate-configuration>
	