

#include <iostream>
#include <thread>

#define WELCOME_USER_MSG "Welcome To Password Generator"
#define MAIN_MSG "Please Give Me The Size Of The Password, Remember To Exit Enter 0"
#define SLEEPING 750


#include <immintrin.h>	// _rdrand32_step


std::string gen_random_ansi(const unsigned int len)
{

	std::string tmp_s;
	
	static const char alphanum[] =
		"0123456789"
		"ABCDEFGHIJKLMNOPQRSTUVWXYZ"
		"abcdefghijklmnopqrstuvwxyz";

	srand((unsigned)time(NULL) * _getpid());

	tmp_s.reserve(len);

	for (unsigned int i = 0; i < len; ++i)
		tmp_s += alphanum[rand() % (sizeof(alphanum) - 1)];


	return tmp_s;

}



int main()
{

	

	std::cout << WELCOME_USER_MSG << "\n\n" << std::endl;

	std::this_thread::sleep_for(std::chrono::milliseconds(SLEEPING));

	unsigned int i;

	while (true)
	{
		std::cout << MAIN_MSG << std::endl;

		std::cin >> i;

		if (!i)
			break;
		

		std::cout << gen_random_ansi(i) << std::endl;
	}

	return 0;
}