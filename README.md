# Instructions
@SpringBootApplication(scanBasePackages = {"pt.figtreestudios.springpokeapi.service"})
@EnableFeignClients(basePackages = {"pt.figtreestudios.springpokeapi.proxy"})
