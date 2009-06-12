    <bean id="${entity.replaceAll(/^./){it.toLowerCase()}}Service" class="${basePackage}.service.${entity}ServiceImpl" />

    <bean id="${entity.replaceAll(/^./){it.toLowerCase()}}Action" scope="prototype"
        class="${basePackage}.action.${entity}Action">
        <constructor-arg ref="${entity.replaceAll(/^./){it.toLowerCase()}}Service" />
    </bean>
