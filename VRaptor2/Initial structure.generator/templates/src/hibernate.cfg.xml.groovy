<?xml version='1.0' encoding='utf-8'?>
<!DOCTYPE hibernate-configuration PUBLIC
	"-//Hibernate/Hibernate Configuration DTD 3.0//EN"
	"http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">
	
<hibernate-configuration>
	<session-factory>
	
		<property name="hibernate.dialect">org.hibernate.dialect.HSQLDialect</property>
		<property name="hibernate.connection.url">jdbc:hsqldb:file:${hsqlDatabasePath}</property>
		<property name="hibernate.connection.driver_class">org.hsqldb.jdbcDriver</property>
		<property name="hibernate.connection.username">sa</property>
		<property name="hibernate.connection.password"></property>

		<property name="hibernate.show_sql">false</property>
		<property name="hibernate.hbm2ddl.auto">update</property>
		<property name="hibernate.cache.provider_class">org.hibernate.cache.HashtableCacheProvider</property>

 		
	</session-factory>
</hibernate-configuration>
	